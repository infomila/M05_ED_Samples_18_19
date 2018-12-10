package expenedoraapp;

/**
 *
 * @author Usuari
 */
public class Expenedora {
     public static TipusCanvi pagarMetalic( int preuEnCentims, byte[] monedesClient, byte[] monedesCaixa) 
     {
        
        TipusCanvi er = TipusCanvi.VENDA_FAIL_ERROR_DADES;
        if( preuEnCentims<=0f ) return er; 
        if( monedesClient == null  ) return er; 
        if( monedesCaixa==null ) return er; 
        if( (monedesClient.length!=3 || monedesCaixa.length!=3)) {
            return er;
        }
        
              
        for(int i=0;i<monedesClient.length;i++) {
            if(monedesClient[i]<0 || monedesCaixa[i]<0) {
                return er;
            }
        }
        // 50 cèntims,  cinc cèntims,  1 cèntim
        int valors[] = new int[]{50,5,1};
        int centimsPagats  = 
                ((int)monedesClient[0])*valors[0]+
                ((int)monedesClient[1])*valors[1]+
                ((int)monedesClient[2])*valors[2];
        if(preuEnCentims>centimsPagats) {
            return TipusCanvi.VENDA_FAIL_IMPORT_INSUFICIENT;
        } else {
            monedesCaixa[2] += monedesClient[2];
            monedesCaixa[1] += monedesClient[1];
            monedesCaixa[0] += monedesClient[0];
            monedesClient[0]=0;
            monedesClient[1]=0;
            monedesClient[2]=0;
            if(preuEnCentims==centimsPagats) {
                
                return TipusCanvi.VENDA_OK_CANVI_EXACTE;
            } else /*if(preuEnCentims<centimsPagats)*/ {

                //----------------------------------
                
                int canvi = centimsPagats - preuEnCentims;
                for(int i=0;i<3;i++) {                
                    int num = canvi/valors[i];
                    if(monedesCaixa[i]<num) {
                        num = monedesCaixa[i];
                    }
                    monedesCaixa[i] -= num;
                    monedesClient[i]=(byte) num;
                    canvi -= num * valors[i];
                    if(canvi==0) {
                                          
                        return TipusCanvi.VENDA_OK_CANVI_EXACTE;
                    }
                }
  
                return TipusCanvi.VENDA_OK_NO_TE_CANVI;
            }
        }
    }    
}

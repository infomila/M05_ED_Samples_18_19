package mila;

public enum TipusForma {
    QUADRAT("Quadrat","Quadrats"),
    CERCLE("Cercle","Cercles"),
    TRIANGLE_RECTANGLE_ISOSCELES("Triangle","Triangles");
    
    private String nomSingular;
    private String nomPlural;
    
    TipusForma(String pNomSingular, String pNomPlural) {
      
      this.nomSingular = pNomSingular;
      this.nomPlural   = pNomPlural;
      
    }
    
    public String getNomSingular() {
      return nomSingular;
    }
    
    public String getNomPlural() {
      return nomPlural;
    }
}
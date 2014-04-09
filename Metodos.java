public class Metodos extends HttpServlet {

    int suma;
    
    private int SumaPares(int inici, int fi){
        
        while(inici<=fi){
        int resultado = inici%2;
        if (resultado ==0)
            suma+=inici;
        }//cierra el while
    return suma;
    }

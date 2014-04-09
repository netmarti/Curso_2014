public class MetodosImpares extends HttpServlet {
    
    int suma;
    private int sumaImpares(int inici, int fi){
        while (inici<=fi){
        int resultado = inici%2;
        if (resultado !=0)
                suma+=inici;
        inici++;
        }//cierra el while
    return suma;
    }

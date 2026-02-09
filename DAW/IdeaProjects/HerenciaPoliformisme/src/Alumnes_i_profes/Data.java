package Alumnes_i_profes;

public class Data {
    private int dia;
    private int mes;
    private int any;

    public Data(int dia, int mes, int any)throws Exception{
        validarData(dia,mes,any);
        this.dia=dia;
        this.mes=mes;
        this.any=any;
    }
    public Data(String dataText)throws Exception{
        if(!dataText.matches("[0-9][0-9]-[0-9][0-9]-[0-9]{4}")){
            throw new Exception("Format incorrecte: DD-MM-AAAA");
        }
        String[] parts= dataText.split("-");

        int d = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int a = Integer.parseInt(parts[2]);
        validarData(d,m,a);

        this.dia=d;
        this.mes=m;
        this.any=a;
    }
    private void validarData(int dia,int mes,int any)throws Exception{
        if(mes>12 || mes<1)throw new Exception("El mes es incorrecte.");
        if(dia<1 || dia>31)throw new Exception("El dia es incorrecte.");
        int[]diesmesos= {31,28,31,30,31,30,31,31,30,31,30,31};
        if(esBisiesto(any))diesmesos[1]=29;
        if(dia>diesmesos[mes-1])throw new Exception("El mes "+mes+" només té "+diesmesos[mes-1]+" dies.");

    }
    private boolean esBisiesto(int any){
        return (any % 4==0 && any % 100 != 0) || (any %400==0);
    }
    @Override
    public String toString(){
        return String.format("%02d-%02d-%04d",dia,mes,any);
    }
}

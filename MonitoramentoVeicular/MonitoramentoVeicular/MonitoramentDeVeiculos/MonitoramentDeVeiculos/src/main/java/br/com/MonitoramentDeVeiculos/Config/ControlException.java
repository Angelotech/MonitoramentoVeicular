package br.com.MonitoramentDeVeiculos.Config;

public class ControlException extends RuntimeException{

    public ControlException(){super("preenchar todos os campos corretamente");}

    public ControlException(String messsage){ super(messsage);}

}

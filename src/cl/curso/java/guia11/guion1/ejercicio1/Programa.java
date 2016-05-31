package cl.curso.java.guia11.Threads.ejercicio1;

public class Programa {

	public static void main(String[] args) {

		CuentaBancaria cuenta = new CuentaBancaria(2000, 12547777);
		RetirarDineroThread retirar = new RetirarDineroThread(cuenta, 500);
		RetirarDineroThread retirar1 = new RetirarDineroThread(cuenta, 500);
		RetirarDineroThread retirar2 = new RetirarDineroThread(cuenta, 500);
		DepositarDineroThread deposito = new DepositarDineroThread(cuenta, 1000);
		DepositarDineroThread deposito1 = new DepositarDineroThread(cuenta, 1500);
		DepositarDineroThread deposito2 = new DepositarDineroThread(cuenta, 1500);
		
		retirar.start();
		try {
			retirar.join();
			retirar1.join();
			retirar2.join();
			deposito.join();
			deposito1.join();
			deposito2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		retirar1.start();
		retirar2.start();
		deposito.start();
		deposito1.start();
		deposito2.start();
	}

}

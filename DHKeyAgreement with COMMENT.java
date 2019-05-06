
// package diffie.hellman;
import java.math.*;

public class DiffieHellman {

    
    public static void main(String[] args) {
        //first we assign two prime numbers
        BigInteger g=new BigInteger("5");    //Let g be 5(a primitive root modulo 23)
	BigInteger p=new BigInteger("23");   //Let p be 23(a prime number)
	if (args.length==1){
            BigInteger privateKey=new BigInteger(args[0]);  // Your Private key 
            BigInteger publicKey=g.modPow(privateKey,p);    // Calculating the public key relevant to your private key
            System.out.println("Public Key: "+publicKey.toString());
	}else if(args.length==2){
            BigInteger privateKey=new BigInteger(args[0]);  // Your Private key
            BigInteger publicKey=new BigInteger(args[1]);   // Public key of the other party
            BigInteger sessionKey=publicKey.modPow(privateKey,p);  // Calculating the session key
            System.out.println("Session Key: "+sessionKey.toString());
	}else{
            System.out.println("Please provide the valid number of arguments."); //If the correct number of arguments are not provided
        }
    }
    
}

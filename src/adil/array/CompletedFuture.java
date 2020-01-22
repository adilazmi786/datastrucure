package adil.array;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class CompletedFuture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Long a=1L;
		a=a-1;
		System.out.println(a);
		CompletableFuture<String> welcomeText = CompletableFuture.supplyAsync(() -> {
		    try {
		        TimeUnit.MINUTES.sleep(1);
		    } catch (InterruptedException e) {
		       throw new IllegalStateException(e);
		    }
		    return "Rajeev";
		}).thenApply(name -> {
		    return "Hello " + name;
		}).thenApply(greeting -> {
		    return greeting + ", Welcome to the CalliCoder Blog";
		});
		try {
			welcomeText.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

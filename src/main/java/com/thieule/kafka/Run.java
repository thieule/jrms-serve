package com.thieule.kafka;


public class Run {

  public static void main(String[] args) {
	  
	  if (args.length < 1) {
		  args = new String[] {
					"consumer",
					"localhost:9092",
					"topicthieu"
					};
      }
	  
	  switch (args[0]) {
      	case "producer":
	          ProducerTest.main(args);
	          break;
      	case "consumer":
	          ConsumerTest.main(args);
	          break;
      default:
          	throw new IllegalArgumentException("Don't know how to do " + args[0]);
	  }
	  

  }

}

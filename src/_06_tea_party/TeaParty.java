package _06_tea_party;

public class TeaParty {
	private String name;
	private boolean isWoman;
	private boolean isKnighted;
    public String welcome(String name, boolean isWoman, boolean isKnighted) {
        	this.name= name;
        	this.isKnighted= isKnighted;
        	this.isWoman= isWoman;
        	if(isWoman&&isKnighted) {
        		return "Hello Lady " + name;
        	}
        	else if(isWoman) {
        		return "Hello Ms. " + name;
        	}
        	else if(isKnighted) {
        		return "Hello Sir " + name;
        	}
        	else {
        		return "Hello Mr. " + name;
        	}
    }
}

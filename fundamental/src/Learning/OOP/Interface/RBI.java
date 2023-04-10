package Learning.OOP.Interface;

public interface RBI {
void policy();
default void RBIPolicy() {
	System.out.println("RBI POlicy");
}

}



	
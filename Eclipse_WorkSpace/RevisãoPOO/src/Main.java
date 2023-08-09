
public class Main {

	public static void main(String[] args) {
		User gabriel = new User();
		gabriel.setNome("Gabriel");
		gabriel.setCPF("050");
		gabriel.addFriend("Ryan");
		
		System.out.println("Lista de Amigos \n");
		for (String friendNome : gabriel.getFriends()) {
			System.out.println(friendNome);
		}
	}

}

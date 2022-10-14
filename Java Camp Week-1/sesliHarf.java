public class sesliHarf {
    public static void main(String[] args) {
        char harf = 'E';
        switch (harf) {
            case 'A':
            case 'U':
            case 'I':
            case 'O':
                System.out.println("Kalın sesli harftir");
                break;
            default:
                System.out.println("ince sesli harftir");
        }

    }
}

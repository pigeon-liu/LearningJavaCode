public enum TestEnum {
    //枚举对象
    RED,BLACK,GREEN;

    public static void main(String[] args) {
        TestEnum testEnum = TestEnum.BLACK;

        switch (testEnum){
            case RED:
                System.out.println("red");
                break;
            case BLACK:
                System.out.println("black");
                break;
            case GREEN:
                System.out.println("green");
                break;
            default:
                break;
        }
    }
}

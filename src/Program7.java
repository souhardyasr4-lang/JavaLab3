class CountObjects {
    static int count = 0;

    CountObjects() {
        count++;
    }

    public static void main(String[] args) {
        CountObjects o1 = new CountObjects();
        CountObjects o2 = new CountObjects();
        CountObjects o3 = new CountObjects();

        System.out.println("Number of objects created = " + count);
    }
}

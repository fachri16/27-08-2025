public class AccountTest3 {
    public static void main(String[] args) {
        Bond b1 = new Bond();
        b1.name = "Rakhean";
        b1.balance = 1000;
        b1.setTermAndRate(24); // 24 bulan → rate 1.5%

        // Simulasi bunga selama 5 bulan
        for (int i = 0; i < 5; i++) {
            b1.earnInterest();
  }
}
}


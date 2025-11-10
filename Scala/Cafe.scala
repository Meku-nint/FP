object CafeApp {
  class Coffee {
    val price: Double = 5.0
  }

  class CreditCard {
    def charge(amount: Double): Unit = {
      println(s"Charging $$${amount} to credit card.")
    }
  }

  class Cafe {
    def buyCoffee(cc: CreditCard): Coffee = {
      val cup = new Coffee()
      cc.charge(cup.price)
      cup
    }
  }

  // Using it
  val card = new CreditCard()
  val cafe = new Cafe()
  val myCoffee = cafe.buyCoffee(card)
}

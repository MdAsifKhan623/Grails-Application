package webstore

class Customer{
    String customerName
    String customerPassword
    String shoppingCart
    static hasMany =[wishlist: WishList]

    static constraints={

        customerName nullable:false
        customerPassword nullable:false
        shoppingCart nullable:true

    }

    String toString(){
        customerName
    }

}

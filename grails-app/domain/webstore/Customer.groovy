package webstore

class Customer{
    String emailId
    String customerName
    String customerPassword
    String shoppingCart
    static hasMany =[wishlist: WishList]

    static constraints={
        emailId nullale: false, unique:true
        customerName nullable:false
        customerPassword nullable:false
        shoppingCart nullable:true

    }

    String toString(){
        customerName
    }

}

package webstore

class Customer{
    Integer customerId
    String customerName
    String customerPassword
    String shoppingCart
    static hasMany =[wishlist: WishList]

    static constraints={
        customerId nullable:false, unique: true
        customerName nullable:false
        customerPassword nullable:false
        shoppingCart nullable:true

    }

    String toString(){
        customerName
    }

}

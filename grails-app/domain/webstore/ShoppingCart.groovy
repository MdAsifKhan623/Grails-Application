package webstore

class ShoppingCart {
    String customerEmailId
    static hasMany =[products: Products]
    static constraints={
        customerId nullable:false
    }
    String toString(){
        customerId
    }
}

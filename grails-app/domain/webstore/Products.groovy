package webstore

class Products{
    Integer productId
    String productName
    String productType
    Double price
    static constraints={
        productId nullable:false, unique: true
        productName nullable:false
        productType nullable:false
        price nullable:true
    }

    String toString(){
        productName
    }
}

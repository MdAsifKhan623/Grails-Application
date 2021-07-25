package webstore
class CustomerController{

    String customerEmailId=""
    def index(){

    }
    def signup(){

    }

    def login(){

    }

    def save(Customer customer){
        customer.save failOnError:true
        createCart(customer.emailId)
        redirect action:"show", id: customer.id

    }

    def createCart(String emailId){

    }
    def add(){
        def product= Products.get(params.id)
        println(customerEmailId+"-"+product.productName)

        redirect action: "shoppingCart"

    }

    def shoppingCart(){

    }

    def wish(){

    }
    def list(Customer customer){

        customerEmailId=customer.emailId
        def products = Products.list()
        [products:products,customers: customer]
    }
    def show(Customer customer){
        [customers:customer]
    }
    def credentials(){

    }
    def find(Customer customer){
        def customers=Customer.list()

        customers.each{cus-> if(cus.emailId==customer.emailId && cus.customerPassword==customer.customerPassword){
            redirect action: "list", id: cus.id
        }
        else{
            redirect action: "credentials"
        }
        }
    }
}

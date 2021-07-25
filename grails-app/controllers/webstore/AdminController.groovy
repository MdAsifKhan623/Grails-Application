package webstore

import javax.validation.constraints.Null

class AdminController{

    def index() {
//        redirect action: "login"
    }

    def credentials(){

    }
    def find(Admin adminData){
        def admins=Admin.list()
        admins.each{adm-> if(adm.adminName==adminData.adminName && adm.password==adminData.password){
            redirect action:"list"
        }else{
            redirect action:"credentials"
        } }
    }

    def login(Admin adminData){
        def admin=Admin.list()
        admin.each{adm-> println(adm.adminName+" "+adm.password)}
    }

    def create() {}

    def save(Products product) {

        product.save failOnError:true
        redirect action:"show", id: product.id

    }
    def edit() {

        def product= Products.get(params.id)
        [products:product]

    }
    def update() {

        def product = Products.get(params.id)
        product.properties = params
        println(product.productName)
        product.save failOnError: true
        redirect action: "show", id: product.id

    }
    def show(Products product) {
//        def product = Products.get(params.productId)
        [products: product]
    }
    def list() {

        def products = Products.list()
        [products:products]
    }
    def delete() {
        def product = Products.get(params.id)
        product.delete failOnError: true
    }

}

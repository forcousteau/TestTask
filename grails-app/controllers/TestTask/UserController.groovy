package TestTask

class UserController {

    def index = {}

    def login = {

        def list = new XmlSlurper().parse(new File("grails-app/assets/userbase.xml"))

        list.user.findAll { u ->
            u.login[0].text() == params.login
        }.each {
            u ->
                if(params.password == u.password[0].text()) {
                    render "Welcome"
                    redirect(action: 'index')
                }
        }

            flash.message =  "Login failed! Try again"


        redirect(action: 'index')
    }
}

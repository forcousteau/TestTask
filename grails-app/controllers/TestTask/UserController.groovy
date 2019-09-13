package TestTask

class UserController {
    //Renders the starting page with login form
    def index = {}
    //Confirms if login is possible
    def login = {
        //Parse xml file with user information
        def list = new XmlSlurper().parse(new File("grails-app/assets/userbase.xml"))
        //Cheching if user is real
        list.user.findAll { u ->
            u.login[0].text() == params.login
        }.each {
            u ->
                if(params.password == u.password[0].text()) {
                    //Successful scenario
                    render "Welcome"
                    redirect(action: 'index')
                }
        }
        //Message in case if log in failed
        flash.message =  "Login failed! Try again"

        redirect(action: 'index')
    }
}

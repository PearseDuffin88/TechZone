import scala.collection.mutable.ArrayBuffer

//Defines the class ActTechInnoCenter
class ActTechInnoCenter{
    
    //Declaring variables
    var startups: ArrayBuffer[String] = ArrayBuffer()
    var smallBusinesses: ArrayBuffer[String] = ArrayBuffer()
    var fundingProviders: ArrayBuffer[String] = ArrayBuffer()
    var mentors: ArrayBuffer[String] = ArrayBuffer()
    
    //Function to add a startup
    def addStartup(name: String) = {
        startups += name
    }
    
    //Function to add a small business
    def addSmallBusiness(name: String) = {
        smallBusinesses += name
    }
    
    //Function to add a funding provider
    def addFundingProvider(name: String) = {
        fundingProviders += name
    }
    
    //Function to add a mentor
    def addMentor(name: String) = {
        mentors += name
    }
    
    //Function to list all startups
    def listStartups() = {
        println("List of Startups: ")
        for(s <- startups) {
            println("- "+s)
        }
    }
    
    //Function to list all small businesses
    def listSmallBusinesses() = {
        println("List of Small Businesses: ")
        for(sb <- smallBusinesses) {
            println("- "+sb)
        }
    }
    
    //Function to list all funding providers
    def listFundingProviders() = {
        println("List of Funding Providers: ")
        for(fp <- fundingProviders) {
            println("- "+fp)
        }
    }
    
    //Function to list all mentors
    def listMentors() = {
        println("List of Mentors: ")
        for(m <- mentors) {
            println("- "+m)
        }
    }
    
    //Function to list all incubation services
    def listIncubationServices() = {
        println("Incubation Services: ")
        println("- Advice from experienced professionals")
        println("- Access to capital")
        println("- Access to networks and resources")
        println("- Mentorship and guidance")
        println("- Business planning and strategy")
        println("- Connections to capital resources")
    }
    
    //Function to find a mentor
    def findMentor(name: String) = {
        var isFound = false
        for(m <- mentors) {
            if(m == name) {
                println("Mentor Found: "+name)
                isFound = true
            }
        }
        if(!isFound) {
            println("Mentor not found: "+name)
        }
    }
    
    //Function to find a funding provider
    def findFundingProvider(name: String) = {
        var isFound = false
        for(fp <- fundingProviders) {
            if(fp == name) {
                println("Funding Provider Found: "+name)
                isFound = true
            }
        }
        if(!isFound) {
            println("Funding Provider not found: "+name)
        }
    }
    
    //Function to find a startup
    def findStartup(name: String) = {
        var isFound = false
        for(s <- startups) {
            if(s == name) {
                println("Startup Found: "+name)
                isFound = true
            }
        }
        if(!isFound) {
            println("Startup not found: "+name)
        }
    }
    
    //Function to find a small business
    def findSmallBusiness(name: String) = {
        var isFound = false
        for(sb <- smallBusinesses) {
            if(sb == name) {
                println("Small Business Found: "+name)
                isFound = true
            }
        }
        if(!isFound) {
            println("Small Business not found: "+name)
        }
    }
    
}

//Declaring the ActTechInnoCenter object
object ActTechInnoCenter {
    def main(args: Array[String]): Unit = {
        //Creating a new instance of the ActTechInnoCenter class
        val actTIC = new ActTechInnoCenter()
        
        //Adding startups
        actTIC.addStartup("Foobar")
        actTIC.addStartup("Abcdef")
        
        //Adding small businesses
        actTIC.addSmallBusiness("Ghibli")
        actTIC.addSmallBusiness("Hijklm")
        
        //Adding funding providers
        actTIC.addFundingProvider("Moon Ventures")
        actTIC.addFundingProvider("Sun Capital")
        
        //Adding mentors
        actTIC.addMentor("John Doe")
        actTIC.addMentor("Jane Doe")
        
        //Listing all members
        actTIC.listStartups()
        actTIC.listSmallBusinesses()
        actTIC.listFundingProviders()
        actTIC.listMentors()
        
        //Listing all incubation services
        actTIC.listIncubationServices()
        
        //Finding a member
        actTIC.findMentor("John Doe")
        actTIC.findFundingProvider("Sun Capital")
        actTIC.findStartup("Abcdef")
        actTIC.findSmallBusiness("Hijklm")
    }
}
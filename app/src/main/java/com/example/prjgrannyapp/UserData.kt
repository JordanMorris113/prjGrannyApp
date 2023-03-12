package com.example.prjgrannyapp

class UserData
{
    private var aName = ArrayList<String>()
    private var aPassword = ArrayList<String>()

    fun AddOldUsers()
    {
     aName.add("Joe")
     aPassword.add("Biden123")
    }

    fun AddNewUser (Name: String, Password: String)
    {
        aName.add(Name)
        aPassword.add(Password)
    }
    fun CheckUser(Name: String, Password: String) : Boolean
    {
        var bLoop = false
        for(i in 0 .. aName.size)
        {

            if((aPassword[i].equals(Password))&&(aName[i].equals(Name)))
            {
                bLoop = true
            }

        }
        return bLoop
    }
}
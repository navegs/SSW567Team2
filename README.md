# SSW 567 Team2 Git Project

This purpose of this project is to provide a configuration management location for SSW567 Team 2  Assignment source code. Ideally, this single git project will be used for all assignments, preventing the team from having to create multiple repositories. While it's best practice to keep repositories seperate for larger projects and applications, this single repository should suffice for academic purposes.

# Instructions (Conceptual)

A folder will be created for each assignment. Each folder shall follow the following naming convention examples: "Assignment1", "Assignment2", "Assignment3", etc.

Each Assignment folder will contain an "Eclipse_Project" folder. This will contain the source code files for the Assignment along with the Eclipse specific files. Source code files shall reside in the /src folder under the /Assignment/Eclipse_Project folder.

It is easier to use the git command line tools to clone, add, commit, and push changes to the repository seperate from Eclipse. After cloning the repository or any updates to your local environment, you can import the Eclipse project into your local environment using Eclipse's "Open Project from File System" wizard and point it to the location where you cloned this repository to your local environment.

Once you have imported the project into Eclipse, you can make changes and test your code locally. Once satisfied with the changes, stage and push the changes to the repository using the git command line.
> I have not been able to get Eclipse's native git nor eGit integration to work correctly.

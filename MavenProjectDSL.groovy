job('First Maven Project DSL'){
	//description for project
	description("First Maven GEnereted By The DSL ${new Date()}")
	scm{
		git("https://github.com/ammouchi/jinkins_upgrade.git","master")
	}
	triggers{
        scm('* * * * *')
	}
	steps{
		maven('clean package','pom.xml')
		
	}
	publishers{
		//artifact project
		archiveArtifacts : '**/*.jar'
	}

}
# gradle-javacard-plugin
A Gradle plugin to convert Java class files into Javacard CAP files.

## Scope

## Usage

### Model Javacard Components

    plugins {
    	id 'com.github.crici.javacard' version '0.0.1'
    }
    
    model {
    	components {
    		acmelib(JavacardLibrarySpec) {
    			packageName 		'com.acme.acmelib'
    			packageAid			'01020304050001'
    			packageApiVersion 	'1.0'
    		}
    	}
    }
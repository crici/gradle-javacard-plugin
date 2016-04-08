package de.crici.gradle.javacard

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.model.RuleSource

class JavacardPlugin implements Plugin<Project> {
	
	void apply( final Project project ) {
		project.logger.info "Applying JavacardPlugin to $project"
	}

	static class JavacardRules extends RuleSource {
		@ComponentType
		void registerJavacardComponent( TypeBuilder<JavacardLibrarySpec> builder ) {}
	}
}

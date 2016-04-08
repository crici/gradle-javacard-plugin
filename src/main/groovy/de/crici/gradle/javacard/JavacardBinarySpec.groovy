package de.crici.gradle.javacard

import org.gradle.model.Managed
import org.gradle.jvm.JvmBinarySpec

@Managed
interface JavacardBinarySpec extends JvmBinarySpec {
	void setPackageName( String packageName )
	String getPackageName()

	void setPackageAid( String packageAid )
	String getPackageAid()

	void setPackageApiVersion( String packageApiVersion )
	String getPackageApiVersion()
}

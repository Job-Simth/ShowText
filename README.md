# ShowText
一个简单的两页面切换跑马灯，后续会实现文字闪烁，速度控制，背景颜色的调整
# How to use/如何使用
Step 1. 先在 build.gradle(Project:XXX) 的 repositories 添加：
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
Step 2. 在 build.gradle(Module:app) 的 dependencies 添加:
	dependencies {
	        compile 'com.github.Job-Simth:ShowText:v1.0'
	}

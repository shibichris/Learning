@Aspect
class Logging { 
  
    @Before("execution(public void com.aspect.ImplementAspect.aspectCall())") 
    public void loggingAdvice1() 
    { 
        System.out.println("Before advice is executed"); 
    } 
  
  
    @After("execution(public void com.aspect.ImplementAspect.aspectCall())") 
    public void loggingAdvice2() 
    { 
        System.out.println("Running After Advice."); 
    } 
  
    @Around("execution(public void com.aspect.ImplementAspect.myMethod())") 
    public void loggingAdvice3() 
    { 
        System.out.println("Before and After invoking method myMethod"); 
    } 
  
    @AfterThrowing("execution(" public void com.aspect.ImplementAspect.aspectCall()) 
    ") 
        public void
        loggingAdvice4() 
    { 
        System.out.println("Exception thrown in method"); 
    } 
  
    @AfterReturning("execution(public void com.aspect.ImplementAspect.myMethod())") 
    public void loggingAdvice5() 
    { 
        System.out.println("AfterReturning advice is run"); 
    } 
} 

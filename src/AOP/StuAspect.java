package AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class StuAspect {
   @Around("execution(* AOP.Student.play())")
   public void tocut(ProceedingJoinPoint joinPoint){

      try {
         joinPoint.proceed();
      } catch (Throwable throwable) {
         throwable.printStackTrace();
      }
      System.out.println("切----------------");
   }
}

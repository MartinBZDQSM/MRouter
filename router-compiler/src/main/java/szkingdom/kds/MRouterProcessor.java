package szkingdom.kds;

import com.google.auto.service.AutoService;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

import szkingdom.kds.annotation.Router;

/**
 * author:hy 2017/12/29.
 * email: yuan.hu@inin88.com
 */
@AutoService(Processor.class)
public class MRouterProcessor extends AbstractProcessor{

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        System.out.println("process");
        processRouter(roundEnv);

        return false;
    }

    private void processRouter(RoundEnvironment roundEnv) {
        for (Element element : roundEnv.getElementsAnnotatedWith(Router.class)) {
            TypeElement classElement = (TypeElement) element.getEnclosingElement();
            String fullClassName = classElement.getQualifiedName().toString();
            System.out.print("fullClassName : " + fullClassName);
        }
    }


}

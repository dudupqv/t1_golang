/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.go.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.go.golang.VarDecl;
import org.xtext.example.go.tests.GolangInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(GolangInjectorProvider.class)
@SuppressWarnings("all")
public class GolangParsingTest {
  @Inject
  private ParseHelper<VarDecl> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x, y float32 = -1, -2");
      _builder.newLine();
      final VarDecl result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void loadModel1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var i int");
      _builder.newLine();
      final VarDecl result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void loadModel2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var k = 0");
      _builder.newLine();
      final VarDecl result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void loadModel3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var U, V, W float64");
      _builder.newLine();
      final VarDecl result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void loadModel4() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var re, im = complexSqrt(-1)");
      _builder.newLine();
      final VarDecl result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

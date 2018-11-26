
package org.hisp.dhis.rules;

import java.util.Set;
import javax.annotation.Nonnull;

// Generated by com.google.auto.value.processor.AutoValueProcessor
 final class AutoValue_RuleExpression extends RuleExpression {

  private final String expression;
  private final Set<String> variables;
  private final Set<String> functions;

  AutoValue_RuleExpression(
      String expression,
      Set<String> variables,
      Set<String> functions) {
    if (expression == null) {
      throw new NullPointerException("Null expression");
    }
    this.expression = expression;
    if (variables == null) {
      throw new NullPointerException("Null variables");
    }
    this.variables = variables;
    if (functions == null) {
      throw new NullPointerException("Null functions");
    }
    this.functions = functions;
  }

  @Nonnull
  @Override
  public String expression() {
    return expression;
  }

  @Nonnull
  @Override
  public Set<String> variables() {
    return variables;
  }

  @Nonnull
  @Override
  public Set<String> functions() {
    return functions;
  }

  @Override
  public String toString() {
    return "RuleExpression{"
        + "expression=" + expression + ", "
        + "variables=" + variables + ", "
        + "functions=" + functions
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RuleExpression) {
      RuleExpression that = (RuleExpression) o;
      return (this.expression.equals(that.expression()))
           && (this.variables.equals(that.variables()))
           && (this.functions.equals(that.functions()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.expression.hashCode();
    h *= 1000003;
    h ^= this.variables.hashCode();
    h *= 1000003;
    h ^= this.functions.hashCode();
    return h;
  }

}
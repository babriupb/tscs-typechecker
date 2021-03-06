package de.upb.cs.swt.tscs.typed.numexpr

import de.upb.cs.swt.tscs.Value
import de.upb.cs.swt.tscs.typed.TypeInformation

/**
  * Represents numeric values in the N-language
  */
case class NumericValueExpr(v : String, typeAnnotation: Option[TypeInformation]) extends Value(v) with TypedNumericExpression

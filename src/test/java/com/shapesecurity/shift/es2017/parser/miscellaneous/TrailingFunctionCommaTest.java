package com.shapesecurity.shift.es2017.parser.miscellaneous;

import com.shapesecurity.functional.data.ImmutableList;
import com.shapesecurity.functional.data.Maybe;
import com.shapesecurity.shift.es2017.ast.ArrowExpression;
import com.shapesecurity.shift.es2017.ast.BindingIdentifier;
import com.shapesecurity.shift.es2017.ast.FormalParameters;
import com.shapesecurity.shift.es2017.ast.LiteralNumericExpression;
import com.shapesecurity.shift.es2017.parser.JsError;
import org.junit.Test;

import static com.shapesecurity.shift.es2017.parser.ParserTestCase.testScript;

public class TrailingFunctionCommaTest {

	@Test
	public void testParams() throws JsError {
		testScript("(a,) => 0", new ArrowExpression(false, new FormalParameters(ImmutableList.of(new BindingIdentifier("a")), Maybe.empty()), new LiteralNumericExpression(0.0)));
	}

}

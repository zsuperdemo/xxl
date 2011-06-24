/* XXL: The eXtensible and fleXible Library for data processing

Copyright (C) 2000-2011 Prof. Dr. Bernhard Seeger
                        Head of the Database Research Group
                        Department of Mathematics and Computer Science
                        University of Marburg
                        Germany

This library is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation; either
version 3 of the License, or (at your option) any later version.

This library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public
License along with this library;  If not, see <http://www.gnu.org/licenses/>. 

    http://code.google.com/p/xxl/

*/

package xxl.core.xxlinq.usecases;

import static xxl.core.xxlinq.columns.ColumnUtils.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import xxl.core.xxlinq.AdvTupleCursor;

public class SelectFiltered extends XXLinqExample {
//LINQ Example: http://msdn.microsoft.com/en-us/vcsharp/aa336758#SelectFiltered

	@Override
	public void executeXXLinq() {
		List<Integer> numbers = Arrays.asList( 5, 4, 1, 3, 9, 8, 6, 7, 2, 0);
		List<String> digits = new ArrayList<String>();
		digits.add("zero");
		digits.add("one");
		digits.add("two");
		digits.add("three");
		digits.add("four");
		digits.add("five");
		digits.add("six");
		digits.add("seven");
		digits.add("eight");
		digits.add("nine");
		digits.add("ten");
		
		
		AdvTupleCursor tupleCursor = new AdvTupleCursor(numbers, "test")
		.where(col("value").LEQ(val(5)))
		.select(colOBJCALL("lowNums", val(digits), "get", col("value")))
		;
		
		
		
		
		
		
		
		
		
		
		
//		AdvTupleCursor tupleCursor = 
//			new AdvTupleCursor( numbers, "numbers")
//		//.where(col(1).LEQ(val(5)))
//		.select(colOBJCALL("digits names", val(digits, "digits"), "get", col("test.value")) )
//		//.select(col("value"), colOBJCALL("length", val(digits), "length"), indexCol())
//		//.select(colOBJCALL("digits_names", val(digits, "digits"), "get", val(1)))
//		;
		
		printExample(tupleCursor);

	}

}

angular.module('searchFilters', []).filter("convertAttribute", function () {
    return function (input) {
        if (input) {
            var word = input.split(',')
            var result = "";
            for (var a in word) {
                if (word[a] === "0") {
                    result += "自然语言  "
                } else if (word[a] === "1") {
                    result += "形容词  "
                } else if (word[a] === "2") {
                    result += "动词  "
                }
            }
            return result;
        }
    }
}).filter("convertEAttribute",function(){
    return function (input){
        if (input) {
            var word = input.split(',')
            var result = "";
            for (var a in word) {
                if (word[a] === "0") {
                    result += "品牌  "
                } else if (word[a] === "1") {
                    result += "类目  "
                } else if (word[a] === "2") {
                    result += "属性  "
                }
            }
            return result;
        }

    }
});
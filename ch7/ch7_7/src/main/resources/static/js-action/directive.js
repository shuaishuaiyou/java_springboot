/**
 * Created by 帅帅 on 2017/11/20.
 */

actionApp.directive('datePicker',function(){
    return {
        restrict: 'AC',
        link:function(scope,elem,attrs){
            elem.datepicker();
        }
    };
});
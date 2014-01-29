package nl.bigo.iriparser;

import org.antlr.v4.runtime.misc.NotNull;

public class DemoListener extends IRIBaseListener {

    @Override
    public void enterIp_v6_address(@NotNull IRIParser.Ip_v6_addressContext ctx) {
        System.out.println("> an IPv6 address : " + ctx.getText());
    }

    @Override
    public void enterScheme(@NotNull IRIParser.SchemeContext ctx) {
        System.out.println("> the scheme      : " + ctx.getText());
    }

    @Override
    public void enterIquery(@NotNull IRIParser.IqueryContext ctx) {
        System.out.println("> a query         : " + ctx.getText());
    }

    @Override
    public void enterIfragment(@NotNull IRIParser.IfragmentContext ctx) {
        System.out.println("> a fragment      : " + ctx.getText());
    }

    @Override
    public void enterIhier_part(@NotNull IRIParser.Ihier_partContext ctx) {
        System.out.println("> ihier-part      : " + ctx.getText());
    }
}

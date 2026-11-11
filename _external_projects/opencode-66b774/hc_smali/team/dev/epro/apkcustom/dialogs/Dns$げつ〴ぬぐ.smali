.class public Lteam/dev/epro/apkcustom/dialogs/Dns$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/dialogs/Dns;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/Dns;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/dialogs/Dns;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/Dns$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/Dns;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .registers 4

    .line 1
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 2
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/Dns$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/Dns;

    .line 3
    iget-object v0, v0, Lteam/dev/epro/apkcustom/dialogs/Dns;->ぉざぅち〻:Landroid/widget/EditText;

    .line 4
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_27

    const-string v0, "Lb:\u001b`m\u00194=JjkHbiHdhI3kMem\u001dko\u001ag9Ag"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_37

    :cond_27
    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/Dns$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/Dns;

    .line 5
    iget-object v0, v0, Lteam/dev/epro/apkcustom/dialogs/Dns;->ぉざぅち〻:Landroid/widget/EditText;

    .line 6
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    :goto_37
    const-string v1, "Nc:Nfg\u001e0:\u001e3h\u001adkJkjHc<\u001edf\u001ddl\u001de=J1"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 7
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 8
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/Dns$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/Dns;

    .line 9
    iget-object v0, v0, Lteam/dev/epro/apkcustom/dialogs/Dns;->ざとぅぼこ〺:Landroid/widget/EditText;

    .line 10
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6f

    const-string v0, "I4fN`gL1mJc9I3;\u001c3:\u001d49MfgI`lO4nMf"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_7f

    :cond_6f
    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/Dns$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/Dns;

    .line 11
    iget-object v0, v0, Lteam/dev/epro/apkcustom/dialogs/Dns;->ざとぅぼこ〺:Landroid/widget/EditText;

    .line 12
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    :goto_7f
    const-string v1, "@alM4=\u001c4g\u001b`m\u00197hIa;I3>La<\u0019ai@1l\u001ba"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/Dns$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/Dns;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

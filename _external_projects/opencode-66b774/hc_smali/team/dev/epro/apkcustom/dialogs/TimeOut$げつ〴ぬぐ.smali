.class public Lteam/dev/epro/apkcustom/dialogs/TimeOut$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/dialogs/TimeOut;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/TimeOut;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/dialogs/TimeOut;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/TimeOut$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/TimeOut;

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

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/TimeOut$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/TimeOut;

    .line 3
    iget-object v0, v0, Lteam/dev/epro/apkcustom/dialogs/TimeOut;->ぉざぅち〻:Landroid/widget/EditText;

    .line 4
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1f

    const/16 v0, 0xa

    goto :goto_33

    :cond_1f
    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/TimeOut$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/TimeOut;

    .line 5
    iget-object v0, v0, Lteam/dev/epro/apkcustom/dialogs/TimeOut;->ぉざぅち〻:Landroid/widget/EditText;

    .line 6
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    :goto_33
    const-string v1, "KklNgjK`9H7fO3hO`n\u0019bmO4iHehAji\u0019b"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/TimeOut$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/TimeOut;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.class public Lteam/dev/epro/apkcustom/dialogs/RequestBlock$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/dialogs/RequestBlock;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .registers 4

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;

    if-eqz p2, :cond_3b

    .line 1
    iget-object p1, p1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->〺でおいここ:Landroid/widget/CheckBox;

    .line 2
    invoke-virtual {p1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result p1

    if-nez p1, :cond_14

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;

    .line 3
    iget-object p1, p1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ぇとしたべど:Landroid/widget/CheckBox;

    const/4 p2, 0x1

    .line 4
    invoke-virtual {p1, p2}, Landroid/widget/CheckBox;->setChecked(Z)V

    :cond_14
    new-instance p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/〺つふすそ;

    invoke-direct {p1}, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/〺つふすそ;-><init>()V

    new-instance p2, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$げつ〴ぬぐ$〺つふすそ;

    invoke-direct {p2, p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$げつ〴ぬぐ$〺つふすそ;-><init>(Lteam/dev/epro/apkcustom/dialogs/RequestBlock$げつ〴ぬぐ;)V

    .line 5
    iput-object p2, p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/〺つふすそ;->のびぶけせ:Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/〺つふすそ;

    .line 6
    new-instance p2, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-direct {p2, p0}, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$げつ〴ぬぐ$げつ〴ぬぐ;-><init>(Lteam/dev/epro/apkcustom/dialogs/RequestBlock$げつ〴ぬぐ;)V

    .line 7
    iput-object p2, p1, Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/〺つふすそ;->きぬどぼみ〸:Lなぎぱいぢぎ/びぐびあび/げつ〴ぬぐ/ぺふねづ〺/〺つふすそ$びぐびあび;

    .line 8
    iget-object p2, p0, Lteam/dev/epro/apkcustom/dialogs/RequestBlock$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/RequestBlock;

    invoke-virtual {p2}, Landroidx/fragment/app/FragmentActivity;->ぉ〲なぱぽた()Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;

    move-result-object p2

    const-string v0, "M1;IelI1jK0nIdn\u001edj\u001dk:O6gMk=L6oNek\u001bfkLbk\u001ea>\u001d7nHfkMcoNkfI0i\u001d7nM79@"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->ぁないぼぎへ(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〳ぜぞぜべっ;Ljava/lang/String;)V

    goto :goto_4a

    .line 9
    :cond_3b
    iget-object p1, p1, Lteam/dev/epro/apkcustom/dialogs/RequestBlock;->ながふずは:Landroid/widget/CheckBox;

    const-string p2, "Hcn\u001ckm\u001efgLehJejMg>\u001b19\u00194k\u001cf;\u001a1m\u001ae"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 10
    invoke-virtual {p1, p2}, Landroid/widget/CheckBox;->setText(Ljava/lang/CharSequence;)V

    :goto_4a
    return-void
.end method

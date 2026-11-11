.class public Lteam/dev/epro/apkcustom/dialogs/TimeOut;
.super Landroidx/appcompat/app/AppCompatActivity;
.source ""


# instance fields
.field public ぉざぅち〻:Landroid/widget/EditText;

.field public ごづごきえ:I

.field public ざとぅぼこ〺:Landroid/widget/ImageView;

.field public は〲ぱなで:Landroid/widget/Button;


# direct methods
.method public constructor <init>()V
    .registers 4

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 1
    sget-object v0, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const/16 v1, 0xa

    const-string v2, "KklNgjK`9H7fO3hO`n\u0019bmO4iHehAji\u0019b"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lteam/dev/epro/apkcustom/dialogs/TimeOut;->ごづごきえ:I

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .registers 3

    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0027

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    const p1, 0x7f09028f

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/TimeOut;->ぉざぅち〻:Landroid/widget/EditText;

    const p1, 0x7f0900b8

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/TimeOut;->ざとぅぼこ〺:Landroid/widget/ImageView;

    const p1, 0x7f09024c

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/TimeOut;->は〲ぱなで:Landroid/widget/Button;

    new-instance v0, Lteam/dev/epro/apkcustom/dialogs/TimeOut$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lteam/dev/epro/apkcustom/dialogs/TimeOut$げつ〴ぬぐ;-><init>(Lteam/dev/epro/apkcustom/dialogs/TimeOut;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/TimeOut;->ざとぅぼこ〺:Landroid/widget/ImageView;

    new-instance v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺/げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぺふねづ〺/げつ〴ぬぐ;-><init>(Lteam/dev/epro/apkcustom/dialogs/TimeOut;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onResume()V
    .registers 5

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/TimeOut;->ぉざぅち〻:Landroid/widget/EditText;

    iget v1, p0, Lteam/dev/epro/apkcustom/dialogs/TimeOut;->ごづごきえ:I

    const-string v2, ""

    const/16 v3, 0xa

    if-ne v1, v3, :cond_e

    goto :goto_1f

    :cond_e
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v3, p0, Lteam/dev/epro/apkcustom/dialogs/TimeOut;->ごづごきえ:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_1f
    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

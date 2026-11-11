.class public Landroidx/appcompat/widget/AppCompatSpinner$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/appcompat/widget/AppCompatSpinner$づざかべべ;
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/AppCompatSpinner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public 〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;

.field public くし〴〺ぅ:Landroid/widget/ListAdapter;

.field public final synthetic づざかべべ:Landroidx/appcompat/widget/AppCompatSpinner;

.field public びぐびあび:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/AppCompatSpinner;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$〺つふすそ;->づざかべべ:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dismiss()V
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざとぅぼこ〺;->dismiss()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;

    :cond_a
    return-void
.end method

.method public onClick(Landroid/content/DialogInterface;I)V
    .registers 6

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$〺つふすそ;->づざかべべ:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {p1, p2}, Landroid/widget/Spinner;->setSelection(I)V

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$〺つふすそ;->づざかべべ:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {p1}, Landroid/widget/Spinner;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_19

    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$〺つふすそ;->づざかべべ:Landroidx/appcompat/widget/AppCompatSpinner;

    iget-object v1, p0, Landroidx/appcompat/widget/AppCompatSpinner$〺つふすそ;->くし〴〺ぅ:Landroid/widget/ListAdapter;

    invoke-interface {v1, p2}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v1

    invoke-virtual {p1, v0, p2, v1, v2}, Landroid/widget/Spinner;->performItemClick(Landroid/view/View;IJ)Z

    .line 1
    :cond_19
    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;

    if-eqz p1, :cond_22

    invoke-virtual {p1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ざとぅぼこ〺;->dismiss()V

    iput-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;

    :cond_22
    return-void
.end method

.method public 〳ぜぞぜべっ(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    return-void
.end method

.method public 〺つふすそ()Z
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    return v0
.end method

.method public ぁごぐすすぃ(Ljava/lang/CharSequence;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$〺つふすそ;->びぐびあび:Ljava/lang/CharSequence;

    return-void
.end method

.method public いいにぽつ(I)V
    .registers 2

    return-void
.end method

.method public おぐぴう〸ず(Landroid/widget/ListAdapter;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$〺つふすそ;->くし〴〺ぅ:Landroid/widget/ListAdapter;

    return-void
.end method

.method public げつ〴ぬぐ()I
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public づざかべべ()Landroid/graphics/drawable/Drawable;
    .registers 2

    const/4 v0, 0x0

    return-object v0
.end method

.method public てぜきぽく(II)V
    .registers 7

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$〺つふすそ;->くし〴〺ぅ:Landroid/widget/ListAdapter;

    if-nez v0, :cond_5

    return-void

    :cond_5
    new-instance v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;

    iget-object v1, p0, Landroidx/appcompat/widget/AppCompatSpinner$〺つふすそ;->づざかべべ:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {v1}, Landroidx/appcompat/widget/AppCompatSpinner;->getPopupContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Landroidx/appcompat/widget/AppCompatSpinner$〺つふすそ;->びぐびあび:Ljava/lang/CharSequence;

    if-eqz v1, :cond_18

    .line 1
    iget-object v2, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/appcompat/app/AlertController$〺つふすそ;

    iput-object v1, v2, Landroidx/appcompat/app/AlertController$〺つふすそ;->びぐびあび:Ljava/lang/CharSequence;

    .line 2
    :cond_18
    iget-object v1, p0, Landroidx/appcompat/widget/AppCompatSpinner$〺つふすそ;->くし〴〺ぅ:Landroid/widget/ListAdapter;

    iget-object v2, p0, Landroidx/appcompat/widget/AppCompatSpinner$〺つふすそ;->づざかべべ:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {v2}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v2

    .line 3
    iget-object v3, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;->げつ〴ぬぐ:Landroidx/appcompat/app/AlertController$〺つふすそ;

    iput-object v1, v3, Landroidx/appcompat/app/AlertController$〺つふすそ;->へぬ〴づぞ:Landroid/widget/ListAdapter;

    iput-object p0, v3, Landroidx/appcompat/app/AlertController$〺つふすそ;->おぐぴう〸ず:Landroid/content/DialogInterface$OnClickListener;

    iput v2, v3, Landroidx/appcompat/app/AlertController$〺つふすそ;->ざとぅぼこ〺:I

    const/4 v1, 0x1

    iput-boolean v1, v3, Landroidx/appcompat/app/AlertController$〺つふすそ;->ぉざぅち〻:Z

    .line 4
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ$げつ〴ぬぐ;->げつ〴ぬぐ()Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;

    .line 5
    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;->びぐびあび:Landroidx/appcompat/app/AlertController;

    .line 6
    iget-object v0, v0, Landroidx/appcompat/app/AlertController;->ぁごぐすすぃ:Landroid/widget/ListView;

    .line 7
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x11

    if-lt v1, v2, :cond_41

    invoke-virtual {v0, p1}, Landroid/widget/ListView;->setTextDirection(I)V

    invoke-virtual {v0, p2}, Landroid/widget/ListView;->setTextAlignment(I)V

    :cond_41
    iget-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぺふねづ〺/ぺぁあねじ;

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public のぷのちつ()I
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public へぬ〴づぞ()Ljava/lang/CharSequence;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$〺つふすそ;->びぐびあび:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public ぺぁあねじ(I)V
    .registers 2

    return-void
.end method

.method public ぺふねづ〺(I)V
    .registers 2

    return-void
.end method

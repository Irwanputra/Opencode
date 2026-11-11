.class public Lteam/dev/epro/apkcustom/widgets/CustomTextView;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source ""


# instance fields
.field public ぁごぐすすぃ:Z

.field public なぎぱいぢぎ:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lteam/dev/epro/apkcustom/widgets/CustomTextView;->ぁごぐすすぃ:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lteam/dev/epro/apkcustom/widgets/CustomTextView;->ぁごぐすすぃ:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lteam/dev/epro/apkcustom/widgets/CustomTextView;->ぁごぐすすぃ:Z

    return-void
.end method


# virtual methods
.method public setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
    .registers 4

    iget-boolean v0, p0, Lteam/dev/epro/apkcustom/widgets/CustomTextView;->ぁごぐすすぃ:Z

    if-nez v0, :cond_12

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    new-instance v0, Lteam/dev/epro/apkcustom/widgets/CustomTextView$げつ〴ぬぐ;

    invoke-direct {v0, p0, p1, p2}, Lteam/dev/epro/apkcustom/widgets/CustomTextView$げつ〴ぬぐ;-><init>(Lteam/dev/epro/apkcustom/widgets/CustomTextView;Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    iput-object v0, p0, Lteam/dev/epro/apkcustom/widgets/CustomTextView;->なぎぱいぢぎ:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->post(Ljava/lang/Runnable;)Z

    goto :goto_30

    :cond_12
    iget-object p2, p0, Lteam/dev/epro/apkcustom/widgets/CustomTextView;->なぎぱいぢぎ:Ljava/lang/Runnable;

    invoke-virtual {p0, p2}, Landroid/widget/TextView;->removeCallbacks(Ljava/lang/Runnable;)Z

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x18

    if-lt p2, v0, :cond_27

    const/4 p2, 0x0

    invoke-static {p1, p2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object p1

    goto :goto_2b

    :cond_27
    invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p1

    .line 2
    :goto_2b
    sget-object p2, Landroid/widget/TextView$BufferType;->NORMAL:Landroid/widget/TextView$BufferType;

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    :goto_30
    return-void
.end method

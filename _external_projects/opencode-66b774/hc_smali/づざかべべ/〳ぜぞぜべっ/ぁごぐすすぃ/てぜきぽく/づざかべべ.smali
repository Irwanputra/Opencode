.class public final Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source ""


# instance fields
.field public 〺つふすそ:Landroid/graphics/drawable/Drawable$ConstantState;

.field public くし〴〺ぅ:Landroid/content/res/ColorStateList;

.field public げつ〴ぬぐ:I

.field public びぐびあび:Landroid/graphics/PorterDuff$Mode;


# direct methods
.method public constructor <init>(Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;)V
    .registers 3

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->くし〴〺ぅ:Landroid/content/res/ColorStateList;

    sget-object v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;->〳ぜぞぜべっ:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->びぐびあび:Landroid/graphics/PorterDuff$Mode;

    if-eqz p1, :cond_1c

    iget v0, p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->げつ〴ぬぐ:I

    iput v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->げつ〴ぬぐ:I

    iget-object v0, p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->〺つふすそ:Landroid/graphics/drawable/Drawable$ConstantState;

    iput-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->〺つふすそ:Landroid/graphics/drawable/Drawable$ConstantState;

    iget-object v0, p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->くし〴〺ぅ:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->くし〴〺ぅ:Landroid/content/res/ColorStateList;

    iget-object p1, p1, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->びぐびあび:Landroid/graphics/PorterDuff$Mode;

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->びぐびあび:Landroid/graphics/PorterDuff$Mode;

    :cond_1c
    return-void
.end method


# virtual methods
.method public getChangingConfigurations()I
    .registers 3

    iget v0, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->げつ〴ぬぐ:I

    iget-object v1, p0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->〺つふすそ:Landroid/graphics/drawable/Drawable$ConstantState;

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable$ConstantState;->getChangingConfigurations()I

    move-result v1

    goto :goto_c

    :cond_b
    const/4 v1, 0x0

    :goto_c
    or-int/2addr v0, v1

    return v0
.end method

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .registers 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .registers 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_c

    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/びぐびあび;

    invoke-direct {v0, p0, p1}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/びぐびあび;-><init>(Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;Landroid/content/res/Resources;)V

    return-object v0

    :cond_c
    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;

    invoke-direct {v0, p0, p1}, Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/くし〴〺ぅ;-><init>(Lづざかべべ/〳ぜぞぜべっ/ぁごぐすすぃ/てぜきぽく/づざかべべ;Landroid/content/res/Resources;)V

    return-object v0
.end method

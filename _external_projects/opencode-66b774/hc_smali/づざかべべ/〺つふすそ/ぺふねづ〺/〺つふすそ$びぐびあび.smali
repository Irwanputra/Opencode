.class public Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$びぐびあび;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$げつ〴ぬぐ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3073\u3050\u3073\u3042\u3073"
.end annotation


# instance fields
.field public final 〺つふすそ:Landroid/graphics/drawable/Drawable;

.field public final くし〴〺ぅ:Ljava/lang/CharSequence;

.field public final げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/Toolbar;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$びぐびあび;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$びぐびあび;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getNavigationContentDescription()Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$びぐびあび;->くし〴〺ぅ:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public 〺つふすそ()Z
    .registers 2

    const/4 v0, 0x1

    return v0
.end method

.method public くし〴〺ぅ()Landroid/graphics/drawable/Drawable;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$びぐびあび;->〺つふすそ:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public げつ〴ぬぐ(Landroid/graphics/drawable/Drawable;I)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$びぐびあび;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 1
    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$びぐびあび;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    if-nez p2, :cond_f

    iget-object p2, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$びぐびあび;->くし〴〺ぅ:Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_12

    :cond_f
    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(I)V

    :goto_12
    return-void
.end method

.method public づざかべべ()Landroid/content/Context;
    .registers 2

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$びぐびあび;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public びぐびあび(I)V
    .registers 3

    if-nez p1, :cond_a

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$びぐびあび;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$びぐびあび;->くし〴〺ぅ:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_f

    :cond_a
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぺふねづ〺/〺つふすそ$びぐびあび;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(I)V

    :goto_f
    return-void
.end method

.class public Landroidx/appcompat/widget/ListPopupWindow$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ListPopupWindow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/appcompat/widget/ListPopupWindow;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ListPopupWindow;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/ListPopupWindow$げつ〴ぬぐ;->〺つふすそ:Landroidx/appcompat/widget/ListPopupWindow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/ListPopupWindow$げつ〴ぬぐ;->〺つふすそ:Landroidx/appcompat/widget/ListPopupWindow;

    .line 1
    iget-object v0, v0, Landroidx/appcompat/widget/ListPopupWindow;->びぐびあび:Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;

    if-eqz v0, :cond_d

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉざぅち〻;->setListSelectionHidden(Z)V

    invoke-virtual {v0}, Landroid/widget/ListView;->requestLayout()V

    :cond_d
    return-void
.end method
